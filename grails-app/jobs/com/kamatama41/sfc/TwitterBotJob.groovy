package com.kamatama41.sfc

import org.slf4j.LoggerFactory

import java.text.SimpleDateFormat

class TwitterBotJob {

	private static def logger = LoggerFactory.getLogger(TwitterBotJob)
	def twitterService
	def random = new Random()
	def dateFormat = new SimpleDateFormat("yyyy/MM/dd")

    static triggers = {
      simple repeatInterval: 7200000L // execute job once in 2 hours
    }

    def execute() {
		def count = Software.count
		if(count > 0) {
			def software = Software.get(random.nextInt(count) + 1)
			String message = "${software.title}(${software.publisher}) 発売日:${dateFormat.format(software.release)} 価格:${software.price}円"
			if(urlAvailable(software.wikipediaUrl)) {
				message += (' ' + software.wikipediaUrl)
			} else {
				message += (' ' + software.googleSearchUrl)
			}
			twitterService.post(message)
		} else {
			log.warn("table under zero -> ${count}")
		}
    }

	private static boolean urlAvailable(String url) {
		def http = (HttpURLConnection)new URL(url).openConnection()
		http.setRequestMethod("GET")
		http.connect()
		def responseCode = http.responseCode

		logger.debug("URL: ${url}, ResponseCode:${responseCode}")

		// ResponseCode is success.
		return  ((int)(responseCode / 100)) == 2
	}
}

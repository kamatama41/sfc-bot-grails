package com.kamatama41.sfc

import org.slf4j.LoggerFactory
import twitter4j.Twitter
import twitter4j.TwitterFactory
import twitter4j.auth.AccessToken

class TwitterService {
	private static def logger = LoggerFactory.getLogger(TwitterService)
	private final Twitter twitter

	TwitterService(String consumerKey, String consumerSecret, String token, String tokenSecret, env) {
		env.each {
			logger.error("${it.key}:${it.value}")
		}
		def singleton = TwitterFactory.singleton
		singleton.setOAuthConsumer(consumerKey, consumerSecret)
		singleton.setOAuthAccessToken(new AccessToken(token, tokenSecret))
		twitter = singleton
	}

    def post(String message) {
		twitter.updateStatus(message)
		logger.info("message posted. (${message})")
    }
}

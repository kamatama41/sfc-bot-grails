package com.kamatama41.sfc

import org.slf4j.LoggerFactory
import twitter4j.Twitter
import twitter4j.TwitterFactory
import twitter4j.auth.AccessToken

class TwitterService {
	private static def logger = LoggerFactory.getLogger(TwitterService)
	private final Twitter twitter

	TwitterService(config) {
		def singleton = TwitterFactory.singleton
		singleton.setOAuthConsumer(config.consumerKey, config.consumerSecret)
		singleton.setOAuthAccessToken(new AccessToken(config.token, config.tokenSecret))
		twitter = singleton
	}

    def post(String message) {
		twitter.updateStatus(message)
		logger.info("message posted. (${message})")
    }

}

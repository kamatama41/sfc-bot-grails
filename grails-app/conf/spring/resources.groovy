import com.kamatama41.sfc.TwitterService

// Place your Spring DSL code here
beans = {
	def env = System.getenv()
	env.each {
		println "${it.key}=${it.value}"
	}
	def consumerKey = env['TWITTER_CONSUMER_KEY']
	def consumerSecret = env['TWITTER_CONSUMER_SECRET']
	def token = env['TWITTER_TOKEN']
	def tokenSecret = env['TWITTER_TOKEN_SECRET']
	twitterService(TwitterService,
			consumerKey, consumerSecret, token, tokenSecret)
}

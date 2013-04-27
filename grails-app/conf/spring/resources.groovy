import com.kamatama41.sfc.TwitterService

// Place your Spring DSL code here
beans = {
	twitterService(TwitterService, grailsApplication.config.twitter)
}

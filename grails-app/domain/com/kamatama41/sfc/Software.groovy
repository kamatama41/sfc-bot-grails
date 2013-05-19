package com.kamatama41.sfc

class Software {
	String title
	String publisher
	Date release
	int price

	static constraints = {
		title blank: false
		publisher blank: false
		release nullable: false
	}

	def getWikipediaUrl() {
		return "http://ja.wikipedia.org/wiki/${encodeUrl(title)}"
	}

	def getGoogleSearchUrl() {
		return "https://www.google.co.jp/search?q=${encodeUrl(title)}"
	}

	private static String encodeUrl(String message) {
		URLEncoder.encode(message, 'UTF-8').replace('+', '%20')
	}
}

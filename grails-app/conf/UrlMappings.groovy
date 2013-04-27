class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(controller: "Software", action: "list")
		"404"(view:'/error/404')
		"500"(view:'/error/500')
	}
}

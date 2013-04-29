package com.kamatama41.sfc

class SoftwareController {
	def list() {
		[softwareList: Software.list(params)]
	}
}

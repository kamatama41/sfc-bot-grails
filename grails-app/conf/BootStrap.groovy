import com.kamatama41.sfc.Software

class BootStrap {
	def grailsApplication

	def init = { servletContext ->
		if (Software.count == 0) {
			def text = grailsApplication.parentContext.getResource("classpath:data/software.csv").inputStream.text
			text.eachLine { csv ->
				def values = csv.split(',')
				def release = new Date(values[0])
				def name = values[1]
				def publisher = values[2]
				def price = Integer.parseInt(values[3])
				new Software(title: name, publisher: publisher, release: release, price: price).save(true)
			}
		}
	}

	def destroy = {
	}
}

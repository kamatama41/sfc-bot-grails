package com.kamatama41.sfc

import org.junit.Test
import org.quartz.CronExpression

/**
 * User: @kamatama41
 */
class TwitterBotJobCronTimerTest {

	@Test
	void cronTimerTest_fire_at_every_2_hour() {
		def expression = new CronExpression(new TwitterBotJob().cronExpression)
		assert expression.getTimeAfter(new Date('2013/04/30 00:00:00')) == new Date('2013/04/30 02:00:00')
		assert expression.getTimeAfter(new Date('2013/04/30 01:30:00')) == new Date('2013/04/30 02:00:00')
		assert expression.getTimeAfter(new Date('2013/04/30 02:00:01')) == new Date('2013/04/30 04:00:00')
	}
}

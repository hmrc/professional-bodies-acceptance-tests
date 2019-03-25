package uk.gov.hmrc.test.ui.cucumber.stepdefs

import com.typesafe.config.{Config, ConfigFactory}
import cucumber.api.java.en.{Then, When}
import uk.gov.hmrc.zap.ZapTest
import org.scalatest.WordSpec
import uk.gov.hmrc.zap.config.ZapConfiguration


class ZapTestStepDef extends WordSpec with ZapTest {

  val customConfig: Config =  ConfigFactory.load().getConfig("zap-automation-config")

  override val zapConfiguration: ZapConfiguration = new ZapConfiguration(customConfig)

  "Kicking off the zap scan" should {
    "should complete successfully" in {
      triggerZapScan()
    }
  }
}
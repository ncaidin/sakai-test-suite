package com.anisakai.test.cucumber.stepdefs

import com.anisakai.test.pageobjects.{Portal, VerifyTools}
import cucumber.api.scala.{EN, ScalaDsl}
import junit.framework.Assert._

/**
 * Created with IntelliJ IDEA.
 * User: gareth
 * Date: 9/9/13
 * Time: 1:32 PM
 * To change this template use File | Settings | File Templates.
 */
class VerifyToolsTest extends ScalaDsl with EN with TearDown {
  Given( """^I am logged in as '(.+)' with a password of '(.+)'$""") { (eid: String, password: String) =>
    Portal.login(eid, password)
  }

  //Scenario: Course Site
  Given( """^I am on '(.+)' site$""") { (siteName: String) =>

    Portal.goToSite(siteName)
  }

  When( """^I click the course tool link the tool should load correctly$""") { () =>
    assertTrue(VerifyTools.checkTools)
  }

  //Scenario: Project Site

  When( """^I click the project tool link the tool should load correctly$""") { () =>
    assertTrue(VerifyTools.checkTools)
  }

  //Scenario: Portfolio Site
  /*
  When("""^I click the portfolio tool link the tool should load correctly$"""){ () =>
    assertTrue(VerifyTools.checkTools())
  }
  */
}

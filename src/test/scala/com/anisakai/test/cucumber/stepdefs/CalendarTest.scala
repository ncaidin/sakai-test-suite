package com.anisakai.test.cucumber.stepdefs

import cucumber.api.scala.{EN, ScalaDsl}
import junit.framework.Assert._
import com.anisakai.test.pageobjects._
/**
 * Created with IntelliJ IDEA.
 * User: gareth
 * Date: 9/6/13
 * Time: 10:07 AM
 * To change this template use File | Settings | File Templates.
 */
class CalendarTest extends ScalaDsl with EN {
  lazy val test = new Calendar

  Given( """^I am on the '(.+)' entry page$""") { (url: String) =>
    test.navigateToPage(url)
  }
  When("""^When user login with '(.+)' as the username and '(.+)' as the password$"""){ (un: String, pw: String) =>
    test.login(un,pw)
  }
  Then("""^I should see myworkspace$"""){ () =>
    assertTrue(test.isMyWorkspace())
  }
  When("""^I select Calendar in left nav bar$"""){ () =>
    test.goToCalendar()
  }
  Then("""^I should be on my calendar$"""){ () =>
    assertTrue(test.checkCalendar())
  }
  When("""^I click the add button$"""){ () =>
    test.addCalEvent()
  }
  When("""^I create an event with random data$"""){ () =>
    test.createRandomEvent()
  }
  When("""^I save the event$"""){ () =>

  }
  Then("""^the event should be added to my calendar$"""){ () =>

  }


}

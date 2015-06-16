package $organization$.$name;format="lower,word"$

import org.scalatest.WordSpec

class HelloWorldSpec extends WordSpec {
  "Hello World" when {
    "It runs" should {
      "do stuff" in {
        assert(1 + 1 === 2)
      }
    }
  }
}

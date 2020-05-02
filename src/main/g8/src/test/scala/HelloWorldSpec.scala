package $organization$.$name;format="lower,word"$

import org.scalatest.wordspec.AnyWordSpec

class HelloWorldSpec extends AnyWordSpec {
  "Hello World" when {
    "It runs" should {
      "do stuff" in {
        assert(1 + 1 === 2)
      }
    }
  }
}

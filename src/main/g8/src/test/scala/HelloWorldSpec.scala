package $organization$.$name;format="lower,word"$

class HelloWorldSpec extends WordSpec {
  "Hello World" when {
    "It runs" should {
      "do stuff" in {
        assert(1 + 1 === 2)
      }
    }
  }
}

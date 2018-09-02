import org.mockito.Mockito
import org.scalamock.scalatest.MockFactory
import org.scalatest.mockito.MockitoSugar
import org.scalatest.{FlatSpec, Matchers}

class OuterNestedTest extends FlatSpec with MockFactory with Matchers with MockitoSugar {
  "Nested Java class" should "be mockable using Mockito from within a scalatest" in {
    val mockedNestedJavaClass = Mockito.mock(classOf[Outer#Nested])

    Mockito.when(mockedNestedJavaClass.methodWithAParam("some value"))
      .thenReturn("mocked", Nil: _*)

    mockedNestedJavaClass.methodWithAParam("some value") shouldBe "mocked"
  }
}
import com.ning.http.client.AsyncHttpClient
import org.mockito.Mockito
import org.mockito.Mockito.atLeastOnce
import org.scalatest.mockito.MockitoSugar
import org.scalatest.{FlatSpec, Matchers}

class NingAsyncHttpClientBoundRequestBuilderMockTest extends FlatSpec with Matchers with MockitoSugar {
  val CONTENT_TYPE = "Content-Type"
  val APPLICATION_JSON = "application/json"

  "BoundRequestBuilder" should "be mockable using Mockito from within a scalatest" in {
    val mockedBoundRequestBuilder = Mockito.mock(classOf[AsyncHttpClient#BoundRequestBuilder])

    mockedBoundRequestBuilder.addHeader(CONTENT_TYPE, APPLICATION_JSON)

    Mockito.verify(mockedBoundRequestBuilder, atLeastOnce()).addHeader(CONTENT_TYPE, APPLICATION_JSON)
  }
}

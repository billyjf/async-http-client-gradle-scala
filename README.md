[![Build Status](https://www.travis-ci.org/billyjf/async-http-client-gradle-scala.svg?branch=master)](https://www.travis-ci.org/billyjf/async-http-client-gradle-scala)

## Gradle 4.8 Scala Plugin Cannot Find Symbol for com.ning.http.client.AsyncHttpClient.BoundRequestBuilder

### Expected Behavior
`import com.ning.http.client.AsyncHttpClient.BoundRequestBuilder` successfully resolves from a Scala source file (it does for the Java file in the sample repo).

### Current Behavior
```
> Task :compileScala
Pruning sources from previous analysis, due to incompatible CompileSetup.
/Users/bfish3/github/async-http-client-gradle-scala/src/main/scala/NingAsyncHttpClientBoundRequestBuilderFailsToResolve.scala:1: value BoundRequestBuilder is not a member of object com.ning.http.client.AsyncHttpClient
import com.ning.http.client.AsyncHttpClient.BoundRequestBuilder
       ^
```

### Context
I'm trying to mock `BoundRequestBuilder` in another repo but cannot as it cannot be imported from a Scala source file in a Gradle Scala repo.

### Steps to Reproduce (for bugs)
Can reproduce by uncommenting import in Scala source and running `./gradlew build`.

#### Fails on SBT 

Minimal Repo to Re-Create w/ SBT: https://github.com/billyjf/async-http-client-sbt-scala

Failing Travis-CI Build: https://www.travis-ci.org/billyjf/async-http-client-sbt-scala

With:
```[error] /home/travis/build/billyjf/async-http-client-sbt-scala/src/main/scala/NingAsyncHttpClientBoundRequestBuilderFailsToResolve.scala:1:8: value BoundRequestBuilder is not a member of object com.ning.http.client.AsyncHttpClient```

### Your Environment
Experienced the bug on mac os and Travis CI pretty consistently.

_ Build scan URL: 
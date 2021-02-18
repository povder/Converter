organization := "org.scalablytyped"
name := "react-dropzone"
version := "10.1.10-df6a16"
scalaVersion := "3.0.0-RC1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.github.japgolly.scalajs-react" %%% "core" % "1.7.5" withDottyCompat scalaVersion.value,
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "react" % "16.9.2-d94f99",
  "org.scalablytyped" %%% "std" % "0.0-unknown-baccf1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")

organization := "org.scalablytyped"
name := "react-transition-group"
version := "2.0-fb04b4"
scalaVersion := "3.0.0-RC1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.7" withDottyCompat scalaVersion.value,
  "org.scalablytyped" %%% "react" % "0.0-unknown-6bfb12",
  "org.scalablytyped" %%% "std" % "0.0-unknown-3d2f8e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")

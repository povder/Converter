organization := "org.scalablytyped"
name := "storybook__vue"
version := "3.3-927533"
scalaVersion := "3.0.0-RC1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "std" % "0.0-unknown-614cf0",
  "org.scalablytyped" %%% "vue" % "2.5.13-d8285e",
  "org.scalablytyped" %%% "webpack-env" % "1.13-21266b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")

organization := "org.scalablytyped"
name := "serve-static"
version := "0.0-unknown-1a616c"
scalaVersion := "3.0.0-RC1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.0-unknown-5595fd",
  "org.scalablytyped" %%% "mime" % "2.0-bfe3b9",
  "org.scalablytyped" %%% "std" % "0.0-unknown-fe9477")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")

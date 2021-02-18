organization := "org.scalablytyped"
name := "mongoose-simple-random"
version := "0.4-c41df1"
scalaVersion := "3.0.0-RC1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "mongoose" % "0.0-unknown-d4578b",
  "org.scalablytyped" %%% "node" % "0.0-unknown-b33294",
  "org.scalablytyped" %%% "std" % "0.0-unknown-5ed217")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")

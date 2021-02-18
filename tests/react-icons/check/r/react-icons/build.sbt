organization := "org.scalablytyped"
name := "react-icons"
version := "2.2-27e4fd"
scalaVersion := "3.0.0-RC1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "react" % "0.0-unknown-5db6f7",
  "org.scalablytyped" %%% "react-icon-base" % "2.1-3bc038",
  "org.scalablytyped" %%% "std" % "0.0-unknown-ce2575")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")

organization := "org.scalablytyped"
name := "storybook__vue"
version := "3.3-fbea3d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "0.0-unknown-b59749",
  "org.scalablytyped" %%% "std" % "0.0-unknown-317df9",
  "org.scalablytyped" %%% "vue" % "2.5.13-38af5c",
  "org.scalablytyped" %%% "webpack-env" % "1.13-dda92b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
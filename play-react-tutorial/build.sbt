name := """play-react-tutorial"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SbtWeb)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  "org.webjars" %% "webjars-play" % "2.4.0-1",
  "org.webjars" % "react" % "0.13.3",
  "org.webjars" % "marked" % "0.3.2",
  "org.webjars" % "jquery" % "2.1.4"
)

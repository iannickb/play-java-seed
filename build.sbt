name := """play-java-seed"""

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

sources in (Compile, doc) := Seq.empty

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

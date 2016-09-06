name := """play-java-seed"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

sources in (Compile, doc) := Seq.empty

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

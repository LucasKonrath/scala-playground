ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.6"

lazy val root = (project in file("."))
  .settings(
    name := "scala-oop-5",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % Test
  )

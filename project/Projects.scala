import sbt._
import Keys._

object Projects extends Build {
  import Dependencies._

  lazy val commonSettings = Seq(
    organization := "xyz.codex",
    name  := "orion",
    version := "0.1.0",
    scalaVersion := "2.11.7"
  )

  lazy val orion = (project in file(".")).
    settings(commonSettings: _*).
    settings(
     libraryDependencies ++=
        compile(akkaActor, akkaSlf4j, config, scopt, scalajHttp, scalaXml,
          slf4jApi, scalaLogging, jsoup) ++
        test(akkaTestKit)
    )
}
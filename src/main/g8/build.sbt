val scalaTestArtifact = "org.scalatest" %% "scalatest" % "3.2.9" % Test

lazy val commonSettings = Seq(
  scalacOptions ++= Seq("-deprecation", "-feature", "-Xlint"), // , "-Xfatal-warnings"),
  version := "$version$",
  scalaVersion := "$scala_version$",
  libraryDependencies += scalaTestArtifact,
  fork := true,
  organization := "$organization$",
  test in assembly := {}  // skip test during assembly
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "$name$",
    libraryDependencies ++= Seq(
      // Add your dependencies here
    )
  )

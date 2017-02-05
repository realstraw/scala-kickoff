val scalaTestArtifact = "org.scalatest" %% "scalatest" % "3.0.1" % "test"

lazy val commonSettings = Seq(
  scalacOptions ++= Seq("-deprecation", "-feature", "-Xlint", "-Xfatal-warnings"),
  version := "$version$",
  scalaVersion := "$scala_version$",
  libraryDependencies += scalaTestArtifact,
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

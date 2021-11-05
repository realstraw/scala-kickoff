val scalaTestArtifact = "org.scalatest" %% "scalatest" % "3.2.+" % Test

lazy val commonSettings = Seq(
  scalacOptions ++= Seq("-deprecation", "-feature", "-Xlint"), // , "-Xfatal-warnings"),
  scalaVersion := "$scala_version$",
  libraryDependencies += scalaTestArtifact,
  fork := true,
  organization := "$organization$",
  assembly / test := {}  // skip test during assembly
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "$name$",
    libraryDependencies ++= Seq(
      // Add your dependencies here
    )
  )

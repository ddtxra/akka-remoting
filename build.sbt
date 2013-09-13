name := "hpa-subcell"

version := "1.0"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.2.1",
  "com.typesafe.akka" %% "akka-remote" % "2.2.1",
  "com.typesafe.akka" %% "akka-kernel" % "2.2.1"
)

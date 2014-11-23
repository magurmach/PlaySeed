name := "play"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
	jdbc,
	javaEbean,
	"org.webjars" %% "webjars-play" % "2.3.0",
  "com.typesafe.play" %% "play-slick" % "0.8.0",
  // Add your own project dependencies in the form:
  // "group" % "artifact" % "version"
  "mysql" % "mysql-connector-java" % "5.1.27"
)

lazy val root = (project in file(".")).enablePlugins(PlayJava)

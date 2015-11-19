name := "acl"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
	jdbc,
	javaEbean,
	"org.webjars" %% "webjars-play" % "2.3.0",
  "com.typesafe.play" %% "play-slick" % "0.8.0",
  // Add your own project dependencies in the form:
  // "group" % "artifact" % "version"
  "postgresql" % "postgresql" % "9.1-901-1.jdbc4"
)

lazy val root = (project in file(".")).enablePlugins(PlayJava)

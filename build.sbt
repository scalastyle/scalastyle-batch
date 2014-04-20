name := "scalastyle-batch"

organization := "org.scalastyle"

versionWithGit

git.baseVersion := "0.5.0"

scalaVersion := "2.10.4"

scalacOptions ++= Seq("-deprecation")

crossScalaVersions := Seq("2.9.3")

description := "Scalastyle style checker for Scala command line"

libraryDependencies ++= Seq("org.scalastyle" %% "scalastyle" % "0.4.0")

publishMavenStyle := true

seq(bintrayPublishSettings:_*)

bintray.Keys.repository in bintray.Keys.bintray := "scalastyle"

bintray.Keys.bintrayOrganization in bintray.Keys.bintray := Some("scalastyle")

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>http://www.scalastyle.org</url>
  <licenses>
    <license>
      <name>Apache 2.0</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.html</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>scm:git:git@github.com:scalastyle/scalastyle-batch.git</url>
    <connection>scm:git:git@github.com:scalastyle/scalastyle-batch.git</connection>
  </scm>
  <developers>
    <developer>
      <id>matthewfarwell</id>
      <name>Matthew Farwell</name>
      <url>http://www.farwell.co.uk</url>
    </developer>
  </developers>)


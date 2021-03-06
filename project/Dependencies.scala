package build

object Dependencies {
  val zincVersion = "1.0.2"
  val coursierVersion = "1.0.0-RC8"
  val lmVersion = "1.0.0"
  val configDirsVersion = "5"
  val caseAppVersion = "1.2.0"
  val sourcecodeVersion = "0.1.4"
  val log4jVersion = "2.8.1"
  val sbtTestInterfaceVersion = "1.0"

  import sbt.librarymanagement.syntax.stringToOrganization
  val configDirectories = "io.github.soc" % "directories" % configDirsVersion
  val libraryManagement = "org.scala-sbt" %% "librarymanagement-ivy" % lmVersion
  val coursier = "io.get-coursier" %% "coursier" % coursierVersion
  val coursierCache = "io.get-coursier" %% "coursier-cache" % coursierVersion
  val caseApp = "com.github.alexarchambault" %% "case-app" % caseAppVersion
  val sourcecode = "com.lihaoyi" %% "sourcecode" % sourcecodeVersion
  val log4jApi = "org.apache.logging.log4j" % "log4j-api" % log4jVersion
  val log4jCore = "org.apache.logging.log4j" % "log4j-core" % log4jVersion
  val sbtTestInterface = "org.scala-sbt" % "test-interface" % sbtTestInterfaceVersion
  val utest = "com.lihaoyi" %% "utest" % "0.6.0" % sbt.Test
}

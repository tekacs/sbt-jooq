scalaVersion := "2.11.7"

enablePlugins(JooqCodegen)

jooqCodegenConfigFile := Some(file("jooq-codegen.xml"))

libraryDependencies ++= Seq("runtime", "jooq").map { conf =>
  "com.h2database" % "h2" % "1.4.191" % conf
}

sbt-jooq
========
[![Build Status](https://travis-ci.org/kxbmap/sbt-jooq.svg?branch=master)](https://travis-ci.org/kxbmap/sbt-jooq)

jOOQ plugin for SBT 0.13.5+


Installation
------------

Add the following to your `project/plugins.sbt`:

```scala
addSbtPlugin("com.github.kxbmap" % "sbt-jooq" % "0.2.0")
```

Configuration
-------------

In your `build.sbt`:

```scala
// Enable the plugin
enablePlugins(JooqCodegen)

// Add your database driver dependency to `jooq` scope
libraryDependencies += "com.h2database" % "h2" % "1.4.191" % "jooq"

// jOOQ library version
// default: 3.7.3
jooqVersion := "3.7.3"

// jOOQ codegen configuration file path
// required this or jooqCodegenConfig
// target directory will replace by jooqCodegenTargetDirectory
jooqCodegenConfigFile := Some(file("path") / "to" / "jooq-codegen.xml")

// generator target directory
// default: sourceManaged in Compile
// jooqCodegenTargetDirectory := file("path") / "to" / "target" / "directory"

// configuration file rewrite rules
// default: replace target directory
// jooqCodegenConfigRewriteRules += /* scala.xml.transform.RewriteRule */

// jOOQ codegen configuration
// required this or jooqCodegenConfigFile
// If setting, jooqCodegenConfigFile, jooqCodegenTargetDirectory and jooqCodegenConfigRewriteRules are ignored
// jooqCodegenConfig :=
//   <configuration>
//     <!-- configurations... -->
//   </configuration>

// codegen execution strategy
// default: CodegenStrategy.IfAbsent
// jooqCodegenStrategy := CodegenStrategy.Always

```

License
-------

Copyright 2015-2016 Tsukasa Kitachi

Apache License, Version 2.0

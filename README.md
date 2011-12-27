HelloWorldAndroidJNI
====================

inspired by http://marakana.com/forums/android/examples/49.html

the difference is development environment:

* Scala 2.9.1
* Eclipse 3.7.1 with ScalaIDE 2.0
* SBT 0.11.1
* android-plugin from git://github.com/jberkel/android-plugin.git 0.6

How to build
------------

ANDROID_HOME=..../android-sdk-linux ANDROID_NDK_HOME=..../android-ndk-r7 sbt android:package-debug

result is bin/HelloWorldAndroidJNI.apk

How to setup environment for new project
----------------------------------------

* add environment variables to .bashrc for example

export ANDROID_HOME=${HOME}/0projectsAndroid/android-sdk-linux

export ANDROID_NDK_HOME=${HOME}/0projectsAndroid/android-ndk-r7

export SCALA_HOME=${HOME}/.sbt/boot/scala-2.9.1/

* create Eclipse Android project

* modify project

 * modify .classpath file (look at git example)

 * modify .project file (look at git example)

* add build.sbt and plugins.sbt

* add to Eclipse external command "sbt" with ANDROID_HOME and ANDROID_NDK_HOME environment variables and arguments android:package-debug android:install-emulator

* add to Eclipse external command sbt-clean

PS if you want to turn off useProguard in Android than modify emulator as described at http://zegoggl.es/2011/07/how-to-preinstall-scala-on-your-android-phone.html. android-plugin _ALWAYS_ drop scala-library

Now you may build and deploy your source code with sbt. And you may debug and edit your code with Eclipse (right click on project -> Run As -> Android Application).

For dependency management use IvyDE plugin as described at IntegrationSupport of SBT

King Regards

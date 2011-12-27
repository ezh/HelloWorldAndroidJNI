import Keys._
import AndroidKeys._

name := "HelloWorldAndroidJNI"

version := "0.0.1"

organization := "org.digimead"

scalaVersion := "2.9.1"

platformName in Android := "android-7"

seq(AndroidProject.androidSettings: _*)

AndroidNdk.settings

platformName in Android := "android-7"



// fix sbt settings for eclipse layout

manifestPath in Android <<= (baseDirectory, manifestName in Android) map ((s,m) => Seq(s / m))

mainAssetsPath in Android <<= (baseDirectory, assetsDirectoryName in Android) (_ / _)

mainResPath in Android <<= (baseDirectory, resDirectoryName in Android) (_ / _)

managedJavaPath <<= (baseDirectory) (_ / "gen")

managedJavaPath in Android <<= (baseDirectory) (_ / "gen")

nativeLibrariesPath in Android <<= (sourceDirectory) (_ / "libs")

resourcesApkName in Android := "resources.ap_"

resourcesApkPath in Android <<= (crossTarget, resourcesApkName in Android) (_ / _)

classesDexPath in Android <<= (crossTarget, classesDexName in Android) (_ / _)

packageApkName in Android <<= (name) ((a) => String.format("%s.apk", a))

packageApkPath in Android <<= (crossTarget, packageApkName in Android) (_ / _)

crossTarget <<= (baseDirectory) (_ / "bin")



// custom project settings

compileOrder := CompileOrder.JavaThenScala

//proguardOption in Android := (keepOptions ++ dontNoteOptions) mkString " ",

useProguard in Android := true

logLevel := Level.Debug

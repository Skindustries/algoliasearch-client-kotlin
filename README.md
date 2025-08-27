# Algolia Kotlin Multiplatform Client (Fork with JavaScript Support)

> **Note:** This is a fork of the [official Algolia Kotlin client](https://github.com/algolia/algoliasearch-client-kotlin) with added JavaScript support for Kotlin Multiplatform projects.


## 📦 Publishing New Versions

To publish a new version of this library, you need to:

1. **Add GitHub Token**: Create a GitHub Personal Access Token with the following scopes:
  - `write:packages`
  - `read:packages`
  - `repo`

2. **Configure local.properties**: Add the token to your `local.properties` file:
   ```properties
   githubPackagesPassword=your_github_token_here
   ```

3. **Publish**: Run the publishing command to deploy to GitHub Packages
   ```
   gradle publishAllPublicationsToGithubPackagesRepository
   ```

For a detailed tutorial on publishing Kotlin Multiplatform libraries with GitHub Packages, see: [Publishing Private Kotlin Multiplatform Libraries with GitHub Packages](https://proandroiddev.com/publishing-private-kotlin-multiplatform-libraries-with-github-packages-4cae23994020)

<p align="center">
  <a href="https://www.algolia.com">
    <img alt="Algolia for Kotlin" src="https://raw.githubusercontent.com/algolia/algoliasearch-client-common/master/banners/kotlin.png" >
  </a>

<h4 align="center">The perfect starting point to integrate <a href="https://algolia.com" target="_blank">Algolia</a> within your Kotlin project</h4>

  <p align="center">
    <a href="https://search.maven.org/search?q=a:algoliasearch-client-kotlin"><img src="https://img.shields.io/maven-central/v/com.algolia/algoliasearch-client-kotlin?label=Download" alt="Latest version"></img></a>
    <a href="https://opensource.org/licenses/MIT"><img src="https://img.shields.io/badge/License-MIT-yellow.svg" alt="Licence"></img></a>
  </p>
</p>

<p align="center">
  <a href="https://www.algolia.com/doc/libraries/kotlin/" target="_blank">Documentation</a>  •
  <a href="https://discourse.algolia.com" target="_blank">Community Forum</a>  •
  <a href="http://stackoverflow.com/questions/tagged/algolia" target="_blank">Stack Overflow</a>  •
  <a href="https://github.com/algolia/algoliasearch-client-kotlin/issues" target="_blank">Report a bug</a>  •
  <a href="https://www.algolia.com/doc/api-client/troubleshooting/faq/kotlin/" target="_blank">FAQ</a>  •
  <a href="https://alg.li/support" target="_blank">Support</a>
</p>

## ✨ Features

- The Kotlin client is compatible with Kotlin `1.6` and higher.
- It is compatible with Kotlin project on the JVM, such as backend and Android applications.
- It relies on the open source Kotlin libraries for seamless integration into Kotlin projects:
    - [Kotlin multiplatform](https://kotlinlang.org/docs/reference/multiplatform.html).
    - [Kotlinx serialization](https://github.com/Kotlin/kotlinx.serialization) for json parsing.
    - [Kotlinx coroutines](https://github.com/Kotlin/kotlinx.coroutines) for asynchronous operations.
    - [Ktor](https://github.com/ktorio/ktor) HTTP client.
- The Kotlin client integrates the actual Algolia documentation in each source file: Request parameters, response fields, methods and concepts; all are documented and link to the corresponding url of the Algolia doc website.
- The client is thread-safe. You can use `SearchClient`, `AnalyticsClient`, and `InsightsClient` in a multithreaded environment.

## 💡 Getting Started

Install the Kotlin client by adding the following dependency to your `gradle.build` file:

  ```gradle
  repositories {
     mavenCentral()
  }
  
  dependencies {
     implementation "com.algolia:algoliasearch-client-kotlin:$version"
  }
  ```
Also, choose and add to your dependencies one of [Ktor http client engines](https://ktor.io/docs/http-client-engines.html).
Alternatively, you can use [algoliasearch-client-kotlin-bom](/client-bom).  

For full documentation, visit the **[Algolia Kotlin API Client](https://www.algolia.com/doc/libraries/kotlin/)**.

## ❓ Troubleshooting

Encountering an issue? Before reaching out to support, we recommend heading to our [FAQ](https://www.algolia.com/doc/api-client/troubleshooting/faq/kotlin/) where you will find answers for the most common issues and gotchas with the client.

## Use the Dockerfile

If you want to contribute to this project without installing all its dependencies, you can use our Docker image. Please check our [dedicated guide](DOCKER_README.md) to learn more.

## 📄 License

The Algolia Kotlin API Client is an open-sourced software licensed under the [MIT license](LICENSE).

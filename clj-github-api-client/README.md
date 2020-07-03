# clj-github-api-client

## Prerequisites

- [Java](http://openjdk.java.net/)

- [Leiningen](https://leiningen.org)

## Usage

```sh
$ export OAUTH_TOKEN="<GitHub personal access token>"
$ lein run
{:data
 {:repository
  {:issues
   {:edges
    [{:node
      {:title "test123",
       :url "https://github.com/octocat/Hello-World/issues/416",
       :labels {:edges []}}}
     {:node
      {:title "test123",
       :url "https://github.com/octocat/Hello-World/issues/417",
       :labels {:edges []}}}
 ...
```

OR

```sh
$ lein uberjar
$ export OAUTH_TOKEN="<GitHub personal access token>"
$ java -jar target/clj-github-api-client.jar
{:data
 {:repository
  {:issues
   {:edges
    [{:node
      {:title "test123",
       :url "https://github.com/octocat/Hello-World/issues/416",
       :labels {:edges []}}}
     {:node
      {:title "test123",
       :url "https://github.com/octocat/Hello-World/issues/417",
       :labels {:edges []}}}
 ...
```

## License

Copyright © 2020 Kent OHASHI

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.

Do you want to load some [configuration](https://12factor.net/config)
[values](https://docs.github.com/en/actions/reference/environment-variables)
[from](https://docs.docker.com/compose/environment-variables/)
[the](https://kubernetes.io/docs/tasks/inject-data-application/define-environment-variable-container/)
[environment](https://en.wikipedia.org/wiki/Environment_variable) in
[Clojure](https://clojure.org/)?

Great news! Clojure makes this easy!

```clojure
(System/getenv "SHELL")
;; => "/usr/local/bin/zsh"
```

There are [many](https://github.com/juxt/aero)
[other](https://github.com/tolitius/cprop/)
[ways](https://github.com/dunaj-project/crispin)
[to](https://github.com/weavejester/environ)
[configure](https://github.com/jarohen/nomad)
[your](https://github.com/grammarly/omniconf)
[Clojure](https://github.com/exoscale/yummy)
[application](https://github.com/Otann/wrench), and some of us have our
**[favorites](https://github.com/outpace/config)**, but environment variables
often factor in.

Give it a shot and see what you can learn!

![nukkit](.github/images/banner.png)

[![License: GPL v3](https://img.shields.io/badge/License-GPL%20v3-blue.svg)](LICENSE)
![PowerNukkit v2.X](https://github.com/GameModsBR/PowerNukkit/workflows/PowerNukkit%20v2.X/badge.svg?branch=2.0-migration)
[![Discord](https://img.shields.io/discord/393465748535640064.svg)](https://discord.gg/5PzMkyK)

Introduction
-------------

Nukkit is nuclear-powered server software for Minecraft: Pocket Edition.
It has a few key advantages over other server software:

* Written in Java, Nukkit is faster and more stable.
* Having a friendly structure, it's easy to contribute to Nukkit's development and rewrite plugins from other platforms into Nukkit plugins.

Nukkit is **under improvement** yet, we welcome contributions. 

Links
--------------------

* __[News](https://nukkitx.com)__
* __[Forums](https://nukkitx.com/forums)__
* __[Discord](https://discord.gg/5PzMkyK)__
* __[Download](https://ci.nukkitx.com/job/NukkitX/job/Nukkit/job/master)__
* __[Plugins](https://nukkitx.com/resources/categories/nukkit-plugins.1)__
* __[Wiki](https://nukkitx.com/wiki/nukkit)__

*Thank you for visiting our official sites. Our official websites are provided free of charge, and we do not like to place ads on the home page affecting your reading. If you like this project, please [donate to us](https://nukkitx.com/donate). All the donations will only be used for Nukkit websites and services.*

Build JAR file
-------------
- `git clone https://github.com/NukkitX/Nukkit`
- `cd Nukkit`
- `git submodule update --init`
- `./mvnw clean package`

The compiled JAR can be found in the `target/` directory.

Running
-------------
Simply run `java -jar nukkit-1.0-SNAPSHOT.jar`.

Plugin API
-------------
Information on Nukkit's API can be found at the [wiki](https://nukkitx.com/wiki/nukkit/).

Docker
-------------

Running Nukkit in [Docker](https://www.docker.com/) (17.05+ or higher).

Build image from source,

```
docker build -t nukkit .
```

Run once to generate the `/data` volume, default settings, and choose language,

```
docker run -it --rm -p 19132:19132 nukkit
```

Use [docker-compose](https://docs.docker.com/compose/overview/) to start server on port `19132` and with `./data` volume,

```
docker-compose up -d
```

Contributing
------------
Please read the [CONTRIBUTING](.github/CONTRIBUTING.md) guide before submitting any issue. Issues with insufficient information or in the wrong format will be closed and will not be reviewed.

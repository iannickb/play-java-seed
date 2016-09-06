FROM iannickb/java
MAINTAINER Iannick Brouillette <iannick.brouillette@meltwater.com>

EXPOSE      9000

COPY        target/universal/stage /data/app
RUN         rm /data/app/bin/*.bat
RUN         mv /data/app/bin/$(ls /data/app/bin/) /data/app/bin/start

WORKDIR     /data

ENTRYPOINT ["./app/bin/start"]

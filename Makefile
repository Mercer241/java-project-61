.PHONY: build run

build:
	cd app && ./gradlew clean build

run:
	cd app && ./gradlew run
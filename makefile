
# build with kotlinc
# bkbot :
# 	kotlinc-js -output build/lunch.js src/main.kt

# build with gradle
bkbot :
	gradle build

# clean with gradle
clean :
# mains
	rm -rf main/lunch
	rm -rf main/*.js
# paths
	rm -rf .classpath .project
# folders
	rm -rf bin .settings .gradle build

# clean with kotlinc
# clean :
# 	rm -rf build/*.js
# 	rm -rf build/lunch

# run with gradle
run :
	node ./main/lunch.js

# run with kotlinc
# run :
# 	node ./build/lunch.js
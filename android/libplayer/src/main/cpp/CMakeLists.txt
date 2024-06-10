cmake_minimum_required(VERSION 3.22.1)

project("libplayer")

add_subdirectory(${CMAKE_CURRENT_SOURCE_DIR}/../../../../../ ./VaiPlayer)

file(GLOB_RECURSE LIB_PLAYER_FILES ./*.*)

add_library(${CMAKE_PROJECT_NAME} SHARED
        # List C/C++ source files with relative paths to this CMakeLists.txt.
        ${LIB_PLAYER_FILES})


target_link_libraries(${CMAKE_PROJECT_NAME}
        # List libraries link to the target library
        vai_player
        android
        log)
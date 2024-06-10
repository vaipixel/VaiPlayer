cmake_minimum_required(VERSION 3.22.1)
project(VaiPlayer)

set(CMAKE_CXX_STANDARD 17)

file(GLOB_RECURSE SRC_FILES
        src/core/*.*)
list(APPEND VAI_PLAYER_FILES ${SRC_FILES})

add_library(vai_player STATIC ${VAI_PLAYER_FILES})
target_link_directories(vai_player PUBLIC include PRIVATE src)

dependencies {
    implementation(project(":sharding-starter"))

    implementation(Libs.springbootWeb)
    implementation(Libs.mybatisPlus)
    implementation(Libs.springbootJtaAtomikos)
    implementation(Libs.springbootStarterAop)

    runtimeOnly(Libs.mysql)
}
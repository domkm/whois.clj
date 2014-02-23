rm -rf gems
GEM_HOME=gems GEM_PATH=gems jgem install whois --version=3.4.4 --no-ri --no-rdoc
rm -rf gems/bin gems/build_info gems/cache gems/doc

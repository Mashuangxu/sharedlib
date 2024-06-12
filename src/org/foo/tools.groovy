import groovy.json.JsonSlurper

def toJson(result){
    def jsonSlurper = new JsonSlurper()
    return jsonSlurper.parseText(result)
}